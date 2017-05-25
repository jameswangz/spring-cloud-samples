

class Client

  def run
    cmd = "curl 'http://localhost:5555/compute/add?a=5&b=6'"
    system cmd
    puts
    cmd = "curl 'http://localhost:5555/products/all'"
    system cmd
    puts
  end    

end

client = Client.new
100.times { client.run }
